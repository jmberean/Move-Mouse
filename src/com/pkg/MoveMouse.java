package com.pkg;

import java.awt.*;
import java.util.*;

public class MoveMouse {
	public static void main(String args[]) {

		System.out.println("Start");
		while (true) {
			try {
				run();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Restarting");
			}
		}
	}

	public static void run() throws Exception {
		final int SLEEPTIME = 60000;
		final int MAX_Y = 4000;
		final int MAX_X = 4000;
		Robot robot = new Robot();
		Random random = new Random();
		PointerInfo pi = null;
		Point p = null;
		double x1 = 0.0;
		double x2 = 0.0;
		double yl = 0.0;
		double y2 = 0.0;

		while (true) {
			pi = MouseInfo.getPointerInfo();
			p = pi.getLocation();
			x1 = p.getX();
			yl = p.getY();
			Thread.sleep(SLEEPTIME);
			pi = MouseInfo.getPointerInfo();
			p = pi.getLocation();
			x2 = p.getX();
			y2 = p.getY();
			if (x1 != x2 || yl != y2) {

			} else {
				robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
			}
		}
	}
}
