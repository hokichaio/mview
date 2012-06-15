package jp.co.netmile.crwdsrc.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 店舗一覧
 *
 * @author Kenkichi Mahara
 *
 */
public class Shops extends SearchResultObject {
	/** 店舗一覧 */
	private List<Shop> shops;

	public void addShop(Shop shop) {
		if (shops == null) {
			shops = new ArrayList<Shop>();
		}

		shops.add(shop);
	}

	/* ================================================================= */
	// getter/setter

	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}

}
