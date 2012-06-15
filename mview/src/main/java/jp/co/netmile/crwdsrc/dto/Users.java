package jp.co.netmile.crwdsrc.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * ユーザ一覧
 *
 * @author Kenkichi Mahara
 *
 */
public class Users extends SearchResultObject {
	/** ユーザ一覧 */
	private List<User> users;

	/* ================================================================= */
	// methods

	public void addUser(User user) {
		if (users == null) {
			users = new ArrayList<User>();
		}

		users.add(user);
	}

	/* ================================================================= */
	// getter/setter

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
