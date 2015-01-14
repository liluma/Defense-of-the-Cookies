package defense.of.the.cookies.domain;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    private int x, y;
    private boolean placeable;
    private TowerEntity te;
    private List<Entity> entities;
    private final int STEPCOUNT = 8;
    
    public Tile(int x, int y){
        setX(x);
        setY(y);
        setPlaceable(false);
        entities = new ArrayList();
    }
    
    public Tile(int x, int y, boolean placeable){
        setX(x);
        setY(y);
        setPlaceable(placeable);
        entities = new ArrayList();
    }
    
    private void setX(int x){
        this.x = x;
    }
    
    private void setY(int y){
        this.y = y;
    }
    
    private void setPlaceable(boolean placeable){
        this.placeable = placeable;
    }
    
    public void setTowerEnttiy(TowerEntity te){
        this.te = te;
    }
    
    private void setEntities(List<Entity> entities){
        this.entities = entities;
    }
    
    public void addEntity(Entity et){
        if(entities != null){
            if(!entities.contains(et)){
                entities.add(et);
            }
        }
    }
    
    public boolean deleteEntity(Entity et){
        if(entities != null){
            if(entities.contains(et)){
                return entities.remove(et);
            }
        }
        return false;
    }
}
