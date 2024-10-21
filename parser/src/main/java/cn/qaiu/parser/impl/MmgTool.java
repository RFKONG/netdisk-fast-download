package cn.qaiu.parser.impl;

import cn.qaiu.entity.ShareLinkInfo;
import cn.qaiu.parser.PanBase;
import io.vertx.core.Future;
import io.vertx.uritemplate.UriTemplate;

/**
 * 咪咕音乐分享
 */
public class MmgTool extends PanBase {

    public static final String API_URL = "";


    public MmgTool(ShareLinkInfo shareLinkInfo) {
        super(shareLinkInfo);
    }

    public Future<String> parse() {
        String shareUrl = shareLinkInfo.getStandardUrl();

        return promise.future();
    }
}
