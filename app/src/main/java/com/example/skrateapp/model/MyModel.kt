package com.example.skrateapp.model

data class MyModel(
    val dashboard_stats: DashboardStats,
    val full_name: String,
    val job_postings: List<JobPosting>,
    val upcoming_sessions: List<UpcomingSession>
)