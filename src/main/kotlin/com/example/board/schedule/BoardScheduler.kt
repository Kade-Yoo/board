package com.example.board.schedule

import org.springframework.scheduling.annotation.Scheduled

class BoardScheduler {

    @Scheduled(cron = "0 1 * * * *")
    fun scheduleView() {

    }
}