package com.kingmao.tdd.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author QX
 * @date 2021/3/28
 */
class ShipTest {

    Ship ship = null;

    @BeforeEach
    public void setUp(){
        Location location = new Location(new Point(1,2), Direction.EAST);
        ship = new Ship(location);
        assertThat(location).isEqualTo(ship.getLocation());
    }

    @Test
    @DisplayName("第一个验证，获取实例")
    public void instanceShip(){
        Location location = new Location(new Point(1,2), Direction.EAST);
        Ship ship = new Ship(location);
        assertThat(location).isEqualTo(ship.getLocation());
    }

    @Test
    @DisplayName("向前方向运动")
    public void moveForwardX(){
        //assertThat(ship.moveForward(),1);
    }

/*
    @Test
    @DisplayName("向前方向运动")
    public void moveForwardX(){
        assertThat(ship.moveForward(),1);
    }
*/




}