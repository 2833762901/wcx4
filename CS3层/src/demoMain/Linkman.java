package demoMain;

import java.util.Date;

public class Linkman {
	//主键
	private int lkmId;
    //用户手机号
    private String lkmKey;
    //联系人姓名
    private String lkmName;
    //联系人电话
    private String lkmMobile;
    //联系人邮箱
    private String lkmEmail;
    //联系人分组
    private String lkmGroup;
    //联系人地址
    private String lkmAddr;
    //联系人注备
    private String lkmRemark;
    

    

    public Linkman(String lkmName) {
		super();
		this.lkmName = lkmName;
	}

	public Linkman(String lkmName, String lkmMobile, String lkmEmail, String lkmGroup, String lkmAddr,
			String lkmRemark) {
		super();
		this.lkmName = lkmName;
		this.lkmMobile = lkmMobile;
		this.lkmEmail = lkmEmail;
		this.lkmGroup = lkmGroup;
		this.lkmAddr = lkmAddr;
		this.lkmRemark = lkmRemark;
	}

	public Linkman(int lkmId) {
		super();
		this.lkmId = lkmId;
	}

	public Linkman() {
		super();
	}

	public Linkman(String lkmKey, String lkmName, String lkmMobile, String lkmEmail, String lkmAddr,String lkmGroup,
			String lkmRemark) {
		super();
		this.lkmKey = lkmKey;
		this.lkmName = lkmName;
		this.lkmMobile = lkmMobile;
		this.lkmEmail = lkmEmail;
		this.lkmGroup = lkmGroup;
		this.lkmAddr = lkmAddr;
		this.lkmRemark = lkmRemark;
	}

	public Linkman(int lkmId, String lkmName, String lkmMobile, String lkmEmail, String lkmAddr,String lkmGroup,
			String lkmRemark) {
		super();
		this.lkmId = lkmId;
		this.lkmName = lkmName;
		this.lkmMobile = lkmMobile;
		this.lkmEmail = lkmEmail;
		this.lkmGroup = lkmGroup;
		this.lkmAddr = lkmAddr;
		this.lkmRemark = lkmRemark;
	}

	public int getLkmId() {
		return lkmId;
	}

	public void setLkmId(int lkmId) {
		this.lkmId = lkmId;
	}

	public String getLkmKey() {
		return lkmKey;
	}

	public void setLkmKey(String lkmKey) {
		this.lkmKey = lkmKey;
	}

	public String getLkmGroup() {
		return lkmGroup;
	}

	public void setLkmGroup(String lkmGroup) {
		this.lkmGroup = lkmGroup;
	}

	public String getLkmAddr() {
		return lkmAddr;
	}

	public void setLkmAddr(String lkmAddr) {
		this.lkmAddr = lkmAddr;
	}

	public String getLkmRemark() {
		return lkmRemark;
	}

	public void setLkmRemark(String lkmRemark) {
		this.lkmRemark = lkmRemark;
	}

	public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }
}
