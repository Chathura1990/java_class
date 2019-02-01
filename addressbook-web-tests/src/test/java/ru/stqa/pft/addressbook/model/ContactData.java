package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private final String id;
  private final String firstName;
  private final String lastName;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String mobile;
  private String group;

  public ContactData(String firstName, String lastName, String nickname, String title, String company, String address, String mobile, String group)
    {
      this.id = null;
      this.firstName = firstName;
      this.lastName = lastName;
      this.nickname = nickname;
      this.title = title;
      this.company = company;
      this.address = address;
      this.mobile = mobile;
      this.group = group;
    }

  public ContactData(String id, String firstName, String lastName, String nickname, String title, String company, String address, String mobile, String group)
  {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.mobile = mobile;
    this.group = group;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(id, that.id) &&
            Objects.equals(firstName, that.firstName) &&
            Objects.equals(lastName, that.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }

  public String getId() {
    return id;
  }

  public String getFirstName () {
      return firstName;
    }

    public String getLastName () {
      return lastName;
    }

    public String getNickname () {
      return nickname;
    }

    public String getTitle () {
      return title;
    }

    public String getCompany () {
      return company;
    }

    public String getAddress () {
      return address;
    }

    public String getMobile () {
      return mobile;
    }

    public String getGroup () {
      return group;
    }

}

