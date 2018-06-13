package warehouse;

import java.util.ArrayList;

import com.alibaba.fastjson.JSONArray;

/**
 * @author Kstar:
 * @version 2018年6月13日 下午4:51:08
 * 
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Object json = JSONArray.toJSON(list);
		System.out.println(json);
	}
}
