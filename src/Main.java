import java.util.Scanner;
import java.util.Random;

public class Main {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину поля: ");
        int fielWidth = scanner.nextInt();
        System.out.print("Введите высоту поля: ");
        int fieldHeight = scanner.nextInt();
        System.out.print("Введите количество мин: ");
        int minesCount = scanner.nextInt();

        int[][][] gameField = new int[fielWidth][fieldHeight][3];

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                for (int k = 0; k < gameField[i][j].length; k++) {
                    gameField[i][j][k] = 0;
                }
            }
        }
        // Расставляем мины (-1)
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < minesCount) {
            int x = random.nextInt(fielWidth);
            int y = random.nextInt(fieldHeight);
            if (gameField[y][x][0] != -1) {
                gameField[y][x][0] = -1;
                minesPlaced++;
            }
        }

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j][0] == -1) {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di, nj = j + dj;
                            if (ni >= 0 && ni < fielWidth && nj >= 0 && nj < fielWidth && gameField[ni][nj][0] != -1) {
                                gameField[ni][nj][0]++;
                            }
                        }
                    }

                }

            }
        }


        /*
         * Сапер
         * Атрибутивный состав:
         * - fieldSize (5-20) int[][]
         * - mineCount short
         * - isFlaggedByPlayer boolean
         * - isGameOver boolean
         *
         * Как оперируем контентом:
         * дефолтное значение 0. Означает мины нет+
         * количество мин рядом положительное число+
         * мина -1;
         */

        /*
         *
         * methdts
         * -- create game field
         */
        // int counterMine = minesCount;
        // int randomNumberX = (int) (Math.random() * 10);
        // int randomNumberY = (int) (Math.random() * 10);
        // for (int i = 0; i < fielWidth; i++) {
        //     for (int j = 0; j < fieldHeight; j++) {
        //         gameField[i][j][0] = 0;  // содержимое = 0
        //         gameField[i][j][1] = 0;  // флаг = 0 (нет)
        //         gameField[i][j][2] = 0;  // открыта = 0 (закрыта)
        //     }
        // }

    /*
     * -- init game
 -- check gameFinish
     * -- gameFinish
     * --- win
     * --- lose
     */

        /*
         * [x][y][0] -- x= -1 y = 0-8 bam
         * [x][y][1] -- x= 0 y = 2 flag
         * [x][y][2] -- открыта (покать ее вес)
         *
         */

        printField3D(gameField, fielWidth, fieldHeight, true);
        scanner.close();

    }

    static void printField3D(int[][][] world, int width, int height, boolean showAllMines) {
        System.out.print("  ");
        for (int j = 0; j < width; j++) {
            System.out.print(RED + j + " " + RESET);
        }
        System.out.println();

        for (int i = 0; i < height; i++) {
            System.out.print(RED + i + " " + RESET);
            for (int j = 0; j < width; j++) {
                int content = world[i][j][0];
                int flag = world[i][j][1];
                int opened = world[i][j][2];

                if (flag == 1) {
                    System.out.print("F "); // Флаг
                } else if (opened == 0 && !showAllMines) {
                    System.out.print("■ "); // Закрытая ячейка
                } else if (content == -1) {
                    System.out.print("* "); // Мина
                } else if (content == 0) {
                    System.out.print("  "); // Пустая ячейка
                } else {
                    System.out.print(getColoredNumber(content) + " "); // Цифра
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static String getColoredNumber(int number) {
        switch (number) {
            case 1:
                return BLUE + number + RESET; // 1 - синий
            case 2:
                return GREEN + number + RESET; // 2 - зелёный
            case 3:
                return RED + number + RESET; // 3 - красный
            case 4:
                return YELLOW + number + RESET; // 4 - жёлтый
            default:
                return String.valueOf(number); // остальные - обычные
        }
    }
}