package com.api.baralho.aplication.Exception;

import java.time.LocalDateTime;
import java.util.List;

public record ApiErrorRecord(
		LocalDateTime dateTime,
		int Code,
		String status,
		List<String> errors) {

}
