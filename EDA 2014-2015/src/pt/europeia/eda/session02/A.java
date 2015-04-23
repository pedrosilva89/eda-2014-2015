package pt.europeia.eda.session02;

import static java.lang.System.out;

// A simple class with a main() method that calls another classe's main()
// method. Not only may there be multiple main() methods in a single
// project, main() methods may even be called from other methods, including
// other main() methods. Not a good idea, but possible.
public class A {

    public static void main(final String[] arguments) {
        out.println("I'm A.main().");
        B.main(arguments);
    }

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