package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NotificationChannelPushResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelPushResponsePayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelPushResponsePayload  implements OneOfinlineResponse200 {
  @JsonProperty("notificationChannel")
  private NotificationChannelPushResponse notificationChannel = null;

  public NotificationChannelPushResponsePayload notificationChannel(NotificationChannelPushResponse notificationChannel) {
    this.notificationChannel = notificationChannel;
    return this;
  }

  /**
   * Get notificationChannel
   * @return notificationChannel
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NotificationChannelPushResponse getNotificationChannel() {
    return notificationChannel;
  }

  public void setNotificationChannel(NotificationChannelPushResponse notificationChannel) {
    this.notificationChannel = notificationChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelPushResponsePayload notificationChannelPushResponsePayload = (NotificationChannelPushResponsePayload) o;
    return Objects.equals(this.notificationChannel, notificationChannelPushResponsePayload.notificationChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelPushResponsePayload {\n");
    
    sb.append("    notificationChannel: ").append(toIndentedString(notificationChannel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
