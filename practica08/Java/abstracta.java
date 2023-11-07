package Java;
public abstract class abstracta{
    private int cal, arena;
    public abstracta(int cal, int arena){
        this.cal=cal;
        this.arena=arena;
    }
    public int getCal() {
        return cal;
    }
    public void setCal(int cal) {
        this.cal = cal;
    }
    public int getArena() {
        return arena;
    }
    public void setArena(int arena) {
        this.arena = arena;
    }
    
}