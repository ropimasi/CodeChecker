package test;

import dev.ropimasi.lib.codechecker.CodeCheckerM11;
import dev.ropimasi.lib.codechecker.CodeCheckerM31;




public class MainTest {

	public static void main(String[] args) {

		System.out.println("M11 getFor \"123456\": " + CodeCheckerM11.getFor("123456"));
		System.out.println("M11 getFor 123456: " + CodeCheckerM11.getFor(123456L));

		System.out.println("M11 getCompleteFor \"123456\": " + CodeCheckerM11.getCompleteFor("123456"));
		System.out.println("M11 getCompleteFor 123456: " + CodeCheckerM11.getCompleteFor(123456L));

		System.out.println("M31 getFor \"123456\": " + CodeCheckerM31.getFor("123456"));
		System.out.println("M31 getFor 123456: " + CodeCheckerM31.getFor(123456L));

		System.out.println("M31 getCompleteFor \"123456\": " + CodeCheckerM31.getCompleteFor("123456"));
		System.out.println("M31 getCompleteFor 123456: " + CodeCheckerM31.getCompleteFor(123456L));

	}

}
