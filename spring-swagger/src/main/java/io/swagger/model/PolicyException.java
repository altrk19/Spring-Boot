package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PolicyException
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class PolicyException  implements OneOfRequestErrorPayloadRequestError {
  @JsonProperty("messageId")
  private String messageId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("variables")
  @Valid
  private List<String> variables = null;

  public PolicyException messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Error response ID, starting with *POL* prefix
   * @return messageId
  **/
  @ApiModelProperty(required = true, value = "Error response ID, starting with *POL* prefix")
      @NotNull

    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public PolicyException text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Detailed explanation of the error condition
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Detailed explanation of the error condition")
      @NotNull

    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public PolicyException variables(List<String> variables) {
    this.variables = variables;
    return this;
  }

  public PolicyException addVariablesItem(String variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<String>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getVariables() {
    return variables;
  }

  public void setVariables(List<String> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyException policyException = (PolicyException) o;
    return Objects.equals(this.messageId, policyException.messageId) &&
        Objects.equals(this.text, policyException.text) &&
        Objects.equals(this.variables, policyException.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, text, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyException {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
