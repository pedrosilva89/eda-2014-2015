package pt.europeia.eda.javaslides.presentation13;

public class Box {

    private final Position topLeftCornerPosition;
    private final Size size;

    public Box(final Position topLeftCornerPosition, final Size size) {
        this.topLeftCornerPosition = topLeftCornerPosition;
        this.size = size;
    }

    public final Position getTopLeftCornerPosition() {
        return topLeftCornerPosition;
    }

    public final Size getSize() {
        return size;
    }

    // …

}

/*
 * Copyright 2015, Manuel Menezes de Sequeira.
 * 
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this code. If not, see http://www.gnu.org/licenses.
 */