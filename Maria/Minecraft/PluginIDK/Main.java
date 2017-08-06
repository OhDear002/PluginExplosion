/*    */ package Maria.Minecraft.PluginIDK;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.entity.Arrow;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.entity.Projectile;
/*    */ import org.bukkit.entity.Snowball;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.ProjectileHitEvent;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Main extends JavaPlugin
/*    */   implements Listener
/*    */ {
/*    */   public void onEnable()
/*    */   {
/* 18 */     getServer().getPluginManager().registerEvents(this, this);
/* 19 */     System.out.println("Off");
/*    */   }
/*    */ 
/*    */   public void onDisable()
/*    */   {
/* 24 */     System.out.println("On");
/*    */   }
/*    */ 
/*    */   @EventHandler(priority=EventPriority.HIGHEST)
/*    */   public void SnowballHit(ProjectileHitEvent e)
/*    */   {
/* 33 */     if (((e.getEntity() instanceof Arrow)) && 
/* 34 */       ((e.getEntity().getShooter() instanceof Player))) {
/* 35 */       Player shooter = (Player)e.getEntity().getShooter();
/* 36 */       if ((shooter.hasPermission("Explosion.allow")) || (shooter.isOp())) {
/* 37 */         double x = e.getEntity().getLocation().getX();
/* 38 */         double y = e.getEntity().getLocation().getY();
/* 39 */         double z = e.getEntity().getLocation().getZ();
/* 40 */         e.getEntity().getWorld().createExplosion(x, y, z, 0.0F);
/*    */       }
/*    */     }
/* 43 */     if (((e.getEntity() instanceof Snowball)) && 
/* 44 */       ((e.getEntity().getShooter() instanceof Player))) {
/* 45 */       Player shooter = (Player)e.getEntity().getShooter();
/* 46 */       if ((shooter.hasPermission("Explosion.allow")) || (shooter.isOp())) {
/* 47 */         double x = e.getEntity().getLocation().getX();
/* 48 */         double y = e.getEntity().getLocation().getY();
/* 49 */         double z = e.getEntity().getLocation().getZ();
/* 50 */         e.getEntity().getWorld().createExplosion(x, y, z, 0.0F);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           E:\Computer\Games\MC\Servers\Local\Test\plugins\ExplosionPl.jar
 * Qualified Name:     Maria.Minecraft.PluginIDK.Main
 * JD-Core Version:    0.6.2
 */