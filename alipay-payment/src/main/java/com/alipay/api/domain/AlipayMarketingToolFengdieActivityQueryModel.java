package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询凤蝶H5页面详情
 *
 * @author auto create
 * @since 1.0, 2017-03-06 17:07:20
 */
public class AlipayMarketingToolFengdieActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2288391869376441213L;

	/**
	 * H5应用的唯一id，调用alipay.marketing.tool.fengdie.activity.create获得
	 */
	@ApiField("activity_id")
	private Long activityId;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

}