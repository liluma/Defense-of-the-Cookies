/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense.of.the.cookies.domain;

/**
 *
 * @author npaul
 */
public interface Entity {
    public void move();
    public void isDestroyed(int receivedDamage);
    public void alterSpeed(int addedSpeed);
    public void alterArmor(int addedArmor);
    public void healEntity(int healAmount);
    public void setImmune();
    public void setShield(int shieldAmmount);
}
