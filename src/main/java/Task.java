// Nichoals Agosto
// 5.29.25
// CS 320

import java.util.Random;

public class Task {
  private final String taskID;
  private String name;
  private String description;

  public Task(String name, String description) {

    if (name == null || name.length() > 20) {
      throw new IllegalArgumentException("Name cannot be null or more than 20 characters");
    }

    if (description == null || description.length() > 50) {
      throw new IllegalArgumentException("Description cannot be null or more than 50 characters");
    }

    this.taskID = generateRandomID(10);
    this.name = name;
    this.description = description;
  }

  // generate random ID
  private String generateRandomID(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    Random rand = new Random();
    StringBuilder sb = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
      sb.append(chars.charAt(rand.nextInt(chars.length())));
    }

    return sb.toString();
  }

  public String getTaskID() {
    return this.taskID;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
