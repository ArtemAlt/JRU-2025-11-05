import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractRepository<EntityKey> {

    private final Set<EntityKey> repository = new HashSet<>();


    public void save(EntityKey entity) {
        repository.add(entity);
    }

    public EntityKey get(String key) {
        for (EntityKey entityKey : repository) {
            if (entityKey.equals(key)) {
                return entityKey;
            }
        }
        return null;
    }

}
