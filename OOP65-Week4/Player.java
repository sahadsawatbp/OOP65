public class Player {
    private String name;
    private String team;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Player p){
        return this.team.equals(p.team);
    }
    
}
