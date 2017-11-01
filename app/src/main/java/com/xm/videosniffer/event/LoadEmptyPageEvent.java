package com.xm.videosniffer.event;

import com.xm.videosniffer.WebWorker;

/**
 * Created by xm on 17-10-31.
 */
public class LoadEmptyPageEvent {

    private String workerNo;

    public LoadEmptyPageEvent(String workerNo) {
        this.workerNo = workerNo;
    }

    public String getWorkerNo() {
        return workerNo;
    }

    public void setWorkerNo(String workerNo) {
        this.workerNo = workerNo;
    }
}
