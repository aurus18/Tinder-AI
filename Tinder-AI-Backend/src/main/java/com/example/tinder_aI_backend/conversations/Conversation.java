package com.example.tinder_aI_backend.conversations;

import com.example.tinder_aI_backend.profiles.Profile;

import java.util.List;

public record Conversation(
        String id,
        String profileId,
        List<ChatMessage> messages
) {
}
