package com.segurapass.api;

import java.net.http.HttpHeaders;

public record ApiResponse<T>(T body, HttpHeaders headers, int statusCode) {}
