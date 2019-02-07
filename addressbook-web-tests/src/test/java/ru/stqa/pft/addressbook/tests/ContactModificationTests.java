package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().homePage();
    if (app.contact().list().size() == 0) {
      app.contact().create(new ContactData().withFirstName("Peter").withLastName("Porker").withNickname("Spider-Man"));
    }
  }

  @Test
  public void testContactModification() {
    Contacts before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId())
            .withFirstName("Miles").withLastName("Morales").withNickname("Spider-Man").withTitle("Friendly Neighbor")
            .withCompany("Avengers").withAddress("20 Ingram St.").withMobile("0987654321");
    app.contact().modify(contact);
    Contacts after = app.contact().all();
    assertEquals(after.size(),before.size());
    assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
  }

}
