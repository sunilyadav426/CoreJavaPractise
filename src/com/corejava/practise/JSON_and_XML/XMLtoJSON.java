package com.corejava.practise.JSON_and_XML;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XMLtoJSON {

	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
    		"<?xml version='1.0'?>" + "<classes>" + "	<geek>" + "		<id>1</id>"
    				+ "		<username>geek1</username>" + "		<EnrolledCourse>D.S.A</EnrolledCourse>"
    				+ "		<mode>online self paced</mode>" + "		<duration>Lifetime</duration>" + "	</geek>"
    				+ "		" + "	<geek>" + "		<id>2</id>" + "		<username>geek2</username>"
    				+ "		<EnrolledCourse>System Design</EnrolledCourse>" + "		<mode>online live course</mode>"
    				+ "		<duration>10 Lectures</duration>" + "	</geek>" + "	" + "	<geek>" + "		<id>3</id>"
    				+ "		<username>geek3</username>" + "		<EnrolledCourse>Compitative Programming</EnrolledCourse>"
    				+ "		<mode>online live course</mode>" + "		<duration>8 weeks</duration>" + "	</geek>"
    				+ "	" + "	<geek>" + "		<id>4</id>" + "		<username>geek4</username>"
    				+ "		<EnrolledCourse>Complete Interview Preparation</EnrolledCourse>"
    				+ "		<mode>online self paced</mode>" + "		<duration>Lifetime</duration>" + "	</geek>" + "	"
    				+ "	<geek>" + "		<id>5</id>" + "		<username>geek5</username>"
    				+ "		<EnrolledCourse>xyz</EnrolledCourse>" + "		<mode></mode>"
    				+ "		<duration>Lifetime</duration>" + "	</geek>" + "</classes>";

    public static void main(String[] args) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }

}
