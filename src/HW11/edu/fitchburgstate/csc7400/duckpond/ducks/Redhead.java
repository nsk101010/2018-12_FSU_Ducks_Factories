/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.SimpleFly;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.DuckQuack;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SimpleSwim;

/** 
 *  Redhead duck for pond
 */
public class Redhead extends Duck {

  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
		super("Redhead",
				"redhead.bmp",
				new SimpleFly("redhead flap"),
				new SimpleSwim("redhead paddle"),
				new DuckQuack());
  }
}
