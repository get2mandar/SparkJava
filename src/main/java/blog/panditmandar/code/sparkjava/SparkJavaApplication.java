package blog.panditmandar.code.sparkjava;

import static spark.Spark.*;

import spark.Request;
import spark.Response;

public class SparkJavaApplication {

	public static void main(String args[]) {
		get("/hello", SparkJavaApplication::helloWorld);
	}

	static String helloWorld(Request req, Response resp) {
		return "Hello World";
	}

}