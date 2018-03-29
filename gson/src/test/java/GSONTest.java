import java.util.Map;

import com.google.gson.Gson;

public class GSONTest {

	public static void main(String[] args) {
		Gson gson = new Gson();
		Map map = gson.fromJson("{\"a\":1,\"aa\":2.0}", Map.class);
		System.out.println(map);

		System.out.println(gson.toJson(map));
		long a = 1;
		int aa = 1;
		System.out.println(a == aa);
	}

}
