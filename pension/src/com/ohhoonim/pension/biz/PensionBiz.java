package com.ohhoonim.pension.biz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ohhoonim.pension.Customer;
import com.ohhoonim.pension.RoomType;
import com.ohhoonim.pension.Standard;
import com.ohhoonim.pension.Sweet;

public class PensionBiz implements IPensionBiz {

	private ArrayList<HashMap<String, Object>> data;
	
	@Override
	public void checkIn(String roomId, String custName, String custPhone) throws Exception {
		// ���ȣ�� ���ڰ� �ƴ� ��� 
		try {
			Integer.parseInt(roomId);
		} catch(Exception e) {
			throw new RuntimeException("[����] �� ��ȣ�� ���ڷ� �Է��ϼ���.");
		}

		Customer.index = 201;
		boolean finedRoom = false;
		for (HashMap<String, Object> roomInfo: data) {
			RoomType room = (RoomType)roomInfo.get(roomId);
			if (room == null) {
				continue;
			} 
			// ������ �˻�
			Set<String> keys = roomInfo.keySet();
			if (keys.size() > 1) {
				throw new RuntimeException("[����] �̹� ���� ���� ���Դϴ�.");
			} else {
				roomInfo.put(String.valueOf(Customer.index), new Customer(custName, custPhone));
				finedRoom = true;
				break;
			}
		}
		// ���� ��ã���� ��
		if (!finedRoom) {
			throw new RuntimeException("[����] ��Ȯ�� �� ��ȣ�� �Է��ϼ���.");
		} else {
			System.out.println("@ ����Ǿ����ϴ�.");
		}
	}

	@Override
	public void checkOut(String roomId) throws Exception {
		// ���ȣ�� ���ڰ� �ƴ� ��� 
		try {
			Integer.parseInt(roomId);
		} catch(Exception e) {
			throw new RuntimeException("[����] �� ��ȣ�� ���ڷ� �Է��ϼ���.");
		}

		Customer.index = 201;
		boolean finedRoom = false;
		for (HashMap<String, Object> roomInfo: data) {
			RoomType room = (RoomType)roomInfo.get(roomId);
			if (room == null) {
				continue;
			} 
			// ������ �˻�
			Set<String> keys = roomInfo.keySet();
			if (keys.size() < 2) {
				throw new RuntimeException("[����] �̹� ��ǵ��ֽ��ϴ�.");
			} else {
				roomInfo.remove(String.valueOf(Customer.index));
				finedRoom = true;
				break;
			}
		}
		// ���� ��ã���� ��
		if (!finedRoom) {
			throw new RuntimeException("[����] ��Ȯ�� �� ��ȣ�� �Է��ϼ���.");
		} else {
			System.out.println("@ ��ǵǾ����ϴ�.");
		}
	}

	/**
	 * ��� ���� ������ �ʱ�ȭ
	 */
	@Override
	public void initiallizeRoomData() {
		data = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> room101 = new HashMap<String, Object>();
		room101.put("101", new Standard());
		data.add(room101);
		
		HashMap<String, Object> room102 = new HashMap<String, Object>();
		room102.put("102", new Standard());
		data.add(room102);
		
		HashMap<String, Object> room103 = new HashMap<String, Object>();
		room103.put("103", new Standard());
		
		data.add(room103);
		HashMap<String, Object> room104 = new HashMap<String, Object>();
		room104.put("104", new Sweet());
		data.add(room104);
		
		HashMap<String, Object> room105 = new HashMap<String, Object>();
		room105.put("105", new Sweet());
		data.add(room105);
	}

	@Override
	public void roomList() {
//		Customer.index = 201;
		for (HashMap<String, Object> roomInfo: data) {
			Object[] infos = new Object[2];
			String roomId = "";
			for (Map.Entry<String, Object> info: roomInfo.entrySet()) {
				String key = info.getKey();
				if (key.equals(String.valueOf(Customer.index))) {
					infos[1] = info.getValue().toString();
				} else {
					infos[0] = info.getValue().toString();
					roomId = key;
				}
			}
			System.out.println(roomId + "ȣ : " + infos[0] + " " + (infos[1] == null ? "" : infos[1]));
		}
	}
}
