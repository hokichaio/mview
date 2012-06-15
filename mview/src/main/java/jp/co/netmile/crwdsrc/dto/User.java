package jp.co.netmile.crwdsrc.dto;

import java.text.ParseException;
import java.util.Date;

import jp.co.netmile.crwdsrc.dto.enumeration.Gender;
import jp.co.netmile.crwdsrc.util.XmlParseUtils;

/**
 * ユーザ<br />
 *
 * @author Kenkichi Mahara
 *
 */
public class User implements FancrewObject {

	/** 会員ステータス:有効 */
	public static final int USER_STATUS_VALID = 1;

	/** ユーザID */
	private Long id;

	/** 性別 */
	private Gender gender;

	/** 誕生日 */
	private Date birthday;

// OEM 様側で設定いただくフィールド

	/** ユーザ名 */
	private String name;

	/** メールアドレス */
	private String mailAddress;

	/** ネットマイルユーザID */
	private int nmUserId;

	/** PC会員ステータスID */
	private int userStatusId = USER_STATUS_VALID;

	/* ================================================================= */
	// インスタンス生成

	public User() {
	}

	/* ================================================================= */
	// Digester 用 setter

	public void setBirthdayString(String birthdayString) throws ParseException {
		this.birthday = XmlParseUtils.parseDate(birthdayString);
	}

	public void setGenderString(String genderName) {
		this.gender = Gender.valueOf(genderName);
	}

	/* ================================================================= */
	// getter/setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public int getNmUserId() {
		return nmUserId;
	}

	public void setNmUserId(int nmUserId) {
		this.nmUserId = nmUserId;
	}

	public int getUserStatusId() {
		return userStatusId;
	}

	public void setUserStatusId(int userStatusId) {
		this.userStatusId = userStatusId;
	}

}
