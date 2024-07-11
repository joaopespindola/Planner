package com.rocketseat.planner.participant;

import java.util.UUID;

// Just to transfer data and not make changes in the real object
public record ParticipantData(UUID id, String name, String email, Boolean isConfirmed) {
}
