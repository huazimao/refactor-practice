package com.kingmao.refactor.marsrover;

import lombok.Data;

/**
 * @author QX
 * @date 2021/3/28
 */
@Data
public class Ship {

    private Location location;

    public Ship(Location location) {
        this.location = location;
    }

}
