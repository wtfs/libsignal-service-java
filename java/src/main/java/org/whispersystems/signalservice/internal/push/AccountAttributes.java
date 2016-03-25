/**
 * Copyright (C) 2014 Open Whisper Systems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.whispersystems.signalservice.internal.push;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountAttributes {

  @JsonProperty
  private String  signalingKey;

  @JsonProperty
  private boolean fetchesMessages;

  @JsonProperty
  private boolean voice;

  @JsonProperty
  private int     registrationId;

  public AccountAttributes(String signalingKey, boolean fetchesMessages, int registrationId, boolean voice) {
    this.signalingKey    = signalingKey;
    this.fetchesMessages = fetchesMessages;
    this.registrationId  = registrationId;
    this.voice          = voice;
  }

  public AccountAttributes() {}

  public String getSignalingKey() {
    return signalingKey;
  }

  public int getRegistrationId() {
    return registrationId;
  }

  public boolean isFetchesMessages() { return fetchesMessages; }

  public boolean isVoice() {
    return voice;
  }
}
