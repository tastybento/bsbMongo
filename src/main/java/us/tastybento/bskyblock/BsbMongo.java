/**
 * 
 */
package us.tastybento.bskyblock;

import org.bukkit.plugin.java.JavaPlugin;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * @author tastybento
 *
 */
public class BsbMongo extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Loaded MongoDB support");
    }
    
    @Override
    public void onDisable() {
        // Do nothing
    }
    
    public MongoDatabase getClient(String databaseName) {
        try (MongoClient client = new MongoClient()) {
            return client.getDatabase(databaseName);
        }
    }
}
