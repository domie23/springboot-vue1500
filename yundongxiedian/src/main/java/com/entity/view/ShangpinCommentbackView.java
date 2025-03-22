package com.entity.view;

import com.entity.ShangpinCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 产品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_commentback")
public class ShangpinCommentbackView extends ShangpinCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shangpin
			/**
			* 产品编号
			*/
			private String shangpinUuidNumber;
			/**
			* 产品名称
			*/
			private String shangpinName;
			/**
			* 产品照片
			*/
			private String shangpinPhoto;
			/**
			* 产品类型
			*/
			private Integer shangpinTypes;
				/**
				* 产品类型的值
				*/
				private String shangpinValue;
			/**
			* 产品原价
			*/
			private Double shangpinOldMoney;
			/**
			* 现价
			*/
			private Double shangpinNewMoney;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 余额
			*/
			private Double newMoney;

	public ShangpinCommentbackView() {

	}

	public ShangpinCommentbackView(ShangpinCommentbackEntity shangpinCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set shangpin

					/**
					* 获取： 产品编号
					*/
					public String getShangpinUuidNumber() {
						return shangpinUuidNumber;
					}
					/**
					* 设置： 产品编号
					*/
					public void setShangpinUuidNumber(String shangpinUuidNumber) {
						this.shangpinUuidNumber = shangpinUuidNumber;
					}

					/**
					* 获取： 产品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 产品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}

					/**
					* 获取： 产品照片
					*/
					public String getShangpinPhoto() {
						return shangpinPhoto;
					}
					/**
					* 设置： 产品照片
					*/
					public void setShangpinPhoto(String shangpinPhoto) {
						this.shangpinPhoto = shangpinPhoto;
					}

					/**
					* 获取： 产品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 产品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 产品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 产品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}

					/**
					* 获取： 产品原价
					*/
					public Double getShangpinOldMoney() {
						return shangpinOldMoney;
					}
					/**
					* 设置： 产品原价
					*/
					public void setShangpinOldMoney(Double shangpinOldMoney) {
						this.shangpinOldMoney = shangpinOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getShangpinNewMoney() {
						return shangpinNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setShangpinNewMoney(Double shangpinNewMoney) {
						this.shangpinNewMoney = shangpinNewMoney;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
