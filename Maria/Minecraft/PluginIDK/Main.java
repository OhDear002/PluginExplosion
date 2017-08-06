 package Maria.Minecraft.PluginIDK;
 
 import java.io.PrintStream;
 import org.bukkit.Location;
 import org.bukkit.Server;
 import org.bukkit.World;
 import org.bukkit.entity.Arrow;
 import org.bukkit.entity.Player;
 import org.bukkit.entity.Projectile;
 import org.bukkit.entity.Snowball;
 import org.bukkit.event.EventHandler;
 import org.bukkit.event.EventPriority;
 import org.bukkit.event.Listener;
 import org.bukkit.event.entity.ProjectileHitEvent;
 import org.bukkit.plugin.PluginManager;
 import org.bukkit.plugin.java.JavaPlugin;
 
 public class Main extends JavaPlugin
   implements Listener
 {
   public void onEnable()
   {
     getServer().getPluginManager().registerEvents(this, this);
     System.out.println("Off");
   }
 
   public void onDisable()
   {
     System.out.println("On");
   }
 
   @EventHandler(priority=EventPriority.HIGHEST)
   public void SnowballHit(ProjectileHitEvent e)
   {
     if (((e.getEntity() instanceof Arrow)) && 
       ((e.getEntity().getShooter() instanceof Player))) {
       Player shooter = (Player)e.getEntity().getShooter();
       if ((shooter.hasPermission("Explosion.allow")) || (shooter.isOp())) {
         double x = e.getEntity().getLocation().getX();
         double y = e.getEntity().getLocation().getY();
         double z = e.getEntity().getLocation().getZ();
         e.getEntity().getWorld().createExplosion(x, y, z, 0.0F);
       }
     }
     if (((e.getEntity() instanceof Snowball)) && 
       ((e.getEntity().getShooter() instanceof Player))) {
       Player shooter = (Player)e.getEntity().getShooter();
       if ((shooter.hasPermission("Explosion.allow")) || (shooter.isOp())) {
         double x = e.getEntity().getLocation().getX();
         double y = e.getEntity().getLocation().getY();
         double z = e.getEntity().getLocation().getZ();
         e.getEntity().getWorld().createExplosion(x, y, z, 0.0F);
       }
     }
   }
 }
