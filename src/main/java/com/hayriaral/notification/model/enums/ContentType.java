package com.hayriaral.notification.model.enums;

/**
 * Enumeration for content types.
 *
 * @author hayriaral
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public enum ContentType {

    /**
     * Used to inform about a transaction or event.
     */
    TRANSACTIONAL,

    /**
     * Used to increase visibility or a specific fashion, style, product or service.
     */
    PROMOTIONAL,

    /**
     * One Time Password: used to a temporary, secure PIN-code sending.
     */
    OTP
}
