package jp.co.netmile.crwdsrc.dto;

import java.text.ParseException;
import java.util.Date;

import jp.co.netmile.crwdsrc.dto.enumeration.CategoryType;
import jp.co.netmile.crwdsrc.dto.enumeration.Prefecture;
import jp.co.netmile.crwdsrc.dto.enumeration.ViewMode;
import jp.co.netmile.crwdsrc.util.XmlParseUtils;

/**
 * 店舗(商品)情報
 *
 * @author Kenkichi Mahara
 *
 */
public class Shop implements FancrewObject {
	/** 店舗ID */
	private Long id;

	/** 表示モード */
	private ViewMode viewMode;

	/** リアル or 通販 */
	private CategoryType categoryType;

	/** 店舗名 */
	private String name;

	/** 店舗名よみ */
	private String nameKana;

	/** 40文字程度の店舗紹介 */
	private String catchPhrase;

	/** 店舗説明 */
	private String description;

	/** 平均予算の文言。例: 7,140円 */
	private String averageBudget;

	/** 店舗公開日時 */
	private Date releaseTimestamp;

	/** 店舗ホームページの URL (PC 用)。ない時は空文字列。 */
	private String pcUrl;

	/** 店舗ホームページの URL (mobile 用)。ない時は空文字列。 */
	private String mobileUrl;

	/** 店舗ロゴ画像 */
	private String logoImageUrl;

	/** 店舗画像 */
	private String topImageUrl;

	/** 店舗画像(グレー表示用) */
	private String topImageUrlGray;

	/** レビュー数 */
	private int numOfReviews;

// リアルモニター用

	/** 郵便番号 (リアルのみ) */
	private String postalCode;

	/** 住所 (リアルのみ) */
	private String address;

	/** 電話番号 (リアルのみ) */
	private String phoneNumber;

	/** 交通アクセス (リアルのみ)。例: ＪＲ新宿駅　東口　徒歩5分　 地下鉄丸ノ内線新宿駅　徒歩3分　 西武新宿線西武新宿駅　徒歩1分 */
	private String access;

	/** 営業時間 (リアルのみ)。例: 月～金　18:00～04:00(L.O.03:00)　土　17:00～04:00(L.O.03:00)　日・祝　17:00～24:00(L.O.23:00) */
	private String businessHours;

	/** 休日 (リアルのみ)。例: 無休 */
	private String fixedHoliday;

	/** 経度 (リアルのみ) */
	private Double latitude;

	/** 緯度 (リアルのみ) */
	private Double longitude;

	/** カテゴリ (リアルのみ) */
	private Category category;

	/** ジャンル (リアルのみ) */
	private Genre genre;

	/** 都道府県 (リアルのみ) */
	private Prefecture prefecture;

	/** エリア (リアルのみ) */
	private Area area;

// 通販モニター用

	/** 配送料（通販のみ）の文言。例: 630円（10,000円以上購入した場合送料無料） */
	private String shippingFee;

	/** 第１階層ジャンル (通販のみ) */
	private Genre genre1;

	/** 第２階層ジャンル (通販のみ) */
	private Genre genre2;

	/* ================================================================= */
	// methods

	/**
	 * 第１階層ジャンルを取得する。<br />
	 *
	 * リアルモニターの場合は category、<br />
	 * 通販モニターの場合は genre1 を返す。
	 *
	 * @return
	 */
	public String getFirstGenre() {
		if (categoryType == CategoryType.リアル) {
			return category.getName();
		} else if (categoryType == CategoryType.通販) {
			return genre1.getName();
		}

		throw new RuntimeException("未対応の categoryType: " + categoryType + ", shop.id=" + id);
	}

	/**
	 * 第２階層ジャンルを取得する。<br />
	 *
	 * リアルモニターの場合は genre、<br />
	 * 通販モニターの場合は genre2 を返す。
	 *
	 * @return
	 */
	public String getSecondGenre() {
		if (categoryType == CategoryType.リアル) {
			return genre.getName();
		} else if (categoryType == CategoryType.通販) {
			return genre2.getName();
		}

		throw new RuntimeException("未対応の categoryType: " + categoryType + ", shop.id=" + id);
	}

	/* ================================================================= */
	// 追加 digester 用追加 setter

	public void setViewModeId(int id) {
		viewMode = ViewMode.valueOfId(id);
	}

	public void setCategoryTypeIdString(String categoryTypeIdString) {
		int id = Integer.parseInt(categoryTypeIdString);
		categoryType = CategoryType.valueOfId(id);
	}

	public void setReleaseTimestampString(String releaseTimestampString) throws ParseException {
		
		if(releaseTimestampString != null && !releaseTimestampString.isEmpty()) {
			releaseTimestamp = XmlParseUtils.parseDateTime(releaseTimestampString);
		}
	}
	/* ================================================================= */
	// getter/setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ViewMode getViewMode() {
		return viewMode;
	}

	public void setViewMode(ViewMode viewMode) {
		this.viewMode = viewMode;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameKana() {
		return nameKana;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseTimestamp() {
		return releaseTimestamp;
	}

	public void setReleaseTimestamp(Date releaseTimestamp) {
		this.releaseTimestamp = releaseTimestamp;
	}

	public String getPcUrl() {
		return pcUrl;
	}

	public void setPcUrl(String pcUrl) {
		this.pcUrl = pcUrl;
	}

	public String getMobileUrl() {
		return mobileUrl;
	}

	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}

	public String getAverageBudget() {
		return averageBudget;
	}

	public void setAverageBudget(String averageBudget) {
		this.averageBudget = averageBudget;
	}

	public String getTopImageUrl() {
		return topImageUrl;
	}

	public void setTopImageUrl(String topImageUrl) {
		this.topImageUrl = topImageUrl;
	}

	public String getLogoImageUrl() {
		return logoImageUrl;
	}

	public void setLogoImageUrl(String logoImageUrl) {
		this.logoImageUrl = logoImageUrl;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getFixedHoliday() {
		return fixedHoliday;
	}

	public void setFixedHoliday(String fixedHoliday) {
		this.fixedHoliday = fixedHoliday;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(String shippingFee) {
		this.shippingFee = shippingFee;
	}

	public String getTopImageUrlGray() {
		return topImageUrlGray;
	}

	public void setTopImageUrlGray(String topImageUrlGray) {
		this.topImageUrlGray = topImageUrlGray;
	}

	public int getNumOfReviews() {
		return numOfReviews;
	}

	public void setNumOfReviews(int numOfReviews) {
		this.numOfReviews = numOfReviews;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Prefecture getPrefecture() {
		return prefecture;
	}

	public void setPrefecture(Prefecture prefecture) {
		this.prefecture = prefecture;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Genre getGenre1() {
		return genre1;
	}

	public void setGenre1(Genre genre1) {
		this.genre1 = genre1;
	}

	public Genre getGenre2() {
		return genre2;
	}

	public void setGenre2(Genre genre2) {
		this.genre2 = genre2;
	}

}
