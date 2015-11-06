package com.sszd.springjms;

import org.apache.log4j.Logger;

import java.util.Map;

/**
 *纯POJO实现消息接收
 * */
public class PureStudentMDP {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(PureStudentMDP.class);

	//private PoiDataFromProviderService poiDataFromProviderService;可以添加Spring依赖注入
	public void process(Map map) {
		Student student = new Student();
		student.setName((String) map.get("key1"));
		student.setAge((String) map.get("key2"));
		System.out.println("PureStudentMDP:");
		logger.error(student);
	}
/*可以直接接收对象
	public void process(Objec obj) {
		Student student = (Student)obj;
		System.out.println(student);
	}
*/

}