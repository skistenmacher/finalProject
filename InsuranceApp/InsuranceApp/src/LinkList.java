
class LinkList {

	// Reference to first Link

	public Link firstLink;

	LinkList() {

		// first link is null

		firstLink = null;

	}

	// Checks if LinkList is empty

	public boolean isEmpty() {

		return (firstLink == null);

	}

	public void insertCustInfo(String name, String state, int drv, int veh, String cov) {

		Link newLink = new Link(name, state, drv, veh, cov);

		newLink.next = firstLink;

		firstLink = newLink;

	}

	public Link removeFirst() {

		Link linkReference = firstLink;

		if (!isEmpty()) {

			firstLink = firstLink.next;

		} else {

			System.out.println("Empty LinkedList");
		}

		return linkReference;

	}

	public void display() {

		Link theLink = firstLink;

		while (theLink != null) {

			theLink.display();

			System.out.println("Next Link: " + theLink.next);

			theLink = theLink.next;

			System.out.println();

		}

	}

	public Link find(String name) {

		Link theLink = firstLink;

		if (!isEmpty()) {

			while (theLink.name != name) {

				// Checks if you are at the end LinkedList

				if (theLink.next == null) {

					// You are at the end of LinkedList

					// did not find a match

					return null;

				} else {

					// Found a link in LinkedList

					theLink = theLink.next;

				}

			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theLink;

	}

	public Link removeLink(String name) {

		Link currentLink = firstLink;

		Link previousLink = firstLink;


		while (currentLink.name != name) {

			// Checks to see if you are at the last link in LinkedList

			if (currentLink.next == null) {

				//not found return null

				return null;

			} else {

				// Check next Link in the list

				previousLink = currentLink;

				currentLink = currentLink.next;

			}

		}

		if (currentLink == firstLink) {

			// Found a match
			// Assign next to first link
			firstLink = firstLink.next;

		} else {

			System.out.println("FOUND A MATCH");

			System.out.println("currentLink: " + currentLink);

			System.out.println("firstLink: " + firstLink);

			previousLink.next = currentLink.next;

		}

		return currentLink;

	}

}
