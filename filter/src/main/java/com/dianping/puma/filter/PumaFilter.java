package com.dianping.puma.filter;

import com.dianping.puma.common.PumaLifeCycle;
import com.dianping.puma.common.model.BinlogEvent;
import com.dianping.puma.filter.exception.PumaFilterException;

/**
 * Created by xiaotian.li on 16/2/15.
 * Email: lixiaotian07@gmail.com
 */
public interface PumaFilter extends PumaLifeCycle {

    boolean filter(BinlogEvent binlogEvent) throws PumaFilterException;
}