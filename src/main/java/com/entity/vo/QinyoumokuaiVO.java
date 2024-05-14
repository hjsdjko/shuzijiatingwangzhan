package com.entity.vo;

import com.entity.QinyoumokuaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 亲友动态
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qinyoumokuai")
public class QinyoumokuaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动态标题
     */

    @TableField(value = "qinyoumokuai_name")
    private String qinyoumokuaiName;


    /**
     * 动态类型
     */

    @TableField(value = "qinyoumokuai_types")
    private Integer qinyoumokuaiTypes;


    /**
     * 封面
     */

    @TableField(value = "qinyoumokuai_photo")
    private String qinyoumokuaiPhoto;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 动态详情
     */

    @TableField(value = "qinyoumokuai_content")
    private String qinyoumokuaiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动态标题
	 */
    public String getQinyoumokuaiName() {
        return qinyoumokuaiName;
    }


    /**
	 * 获取：动态标题
	 */

    public void setQinyoumokuaiName(String qinyoumokuaiName) {
        this.qinyoumokuaiName = qinyoumokuaiName;
    }
    /**
	 * 设置：动态类型
	 */
    public Integer getQinyoumokuaiTypes() {
        return qinyoumokuaiTypes;
    }


    /**
	 * 获取：动态类型
	 */

    public void setQinyoumokuaiTypes(Integer qinyoumokuaiTypes) {
        this.qinyoumokuaiTypes = qinyoumokuaiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getQinyoumokuaiPhoto() {
        return qinyoumokuaiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setQinyoumokuaiPhoto(String qinyoumokuaiPhoto) {
        this.qinyoumokuaiPhoto = qinyoumokuaiPhoto;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：动态详情
	 */
    public String getQinyoumokuaiContent() {
        return qinyoumokuaiContent;
    }


    /**
	 * 获取：动态详情
	 */

    public void setQinyoumokuaiContent(String qinyoumokuaiContent) {
        this.qinyoumokuaiContent = qinyoumokuaiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
