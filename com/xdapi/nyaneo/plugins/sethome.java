//sethome 명령어

Player p = (Player) sender;
if(cmd.getName().equals("sethome")) {
    getConfig.set(p.getName() + "-world", p.getWorld().getName());
    getConfig.set(p.getName() + "-X", p.getLocation().getX());
    getConfig.set(p.getName() + "-Y", p.getLocation().getY());
    getConfig.set(p.getName() + "-Z", p.getLocation().getZ());
this.saveConfig();

}

if(cmd.getName().equals("home")) {
if(getConfig().getString(p.getName()+"-world") != null) {
p.teleport(new Location(Bukkit.getWorld(getConfig().getString(p.getName()+"-world")), getConfig().getDouble(p.getName()+"-X"),getConfig().getDouble(p.getName()+"-Y"),getConfig().getDouble(p.getName()+"-Z"));
p.sendMessage(ChatColor.GREEN + "성공적으로 이동하였습니다!");
    } else {
   p.sendMessage(ChatColor.RED + " 홈이 없습니다..");
  }
}

if(cmd.getName().equals("delhome")) {
getConfig.set(p.getName()+"-world" , null);
getConfig.set(p.getName()+"-X" , null);
getConfig.set(p.getName()+"-Y" , null);
getConfig.set(p.getName()+"-Z" , null);
this.saveConfig()
}
