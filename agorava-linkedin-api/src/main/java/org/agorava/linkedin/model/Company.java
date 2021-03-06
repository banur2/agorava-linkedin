/*
 * Copyright 2013 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.linkedin.model;

import java.io.Serializable;
import java.util.List;

import org.agorava.api.function.IntIdentifiable;
import org.agorava.api.function.Labeled;
import org.agorava.api.function.Nameable;

/**
 * Model class representing a Company
 * 
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 * @author Werner Keil
 */
public class Company implements Nameable, IntIdentifiable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6333534166371535518L;

	private final int id;

	private final String name;

	private String industry;

	private String size;

	private String type;

	private String blogRssUrl;

	private CompanyType companyType;

	private String description;

	private List<String> emailDomains;

	private CodeAndName employeeCountRange;

	private int foundedYear;

	private List<CompanyLocation> locations;

	private String logoUrl;

	private int numFollowers;

	private List<String> specialties;

	private String squareLogoUrl;

	private CodeAndName status;

	private CodeAndName stockExchange;

	private String ticker;

	private String twitterId;

	private String universalName;

	private String websiteUrl;

	public Company(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIndustry() {
		return industry;
	}

	public String getSize() {
		return size;
	}

	/** @deprecated use getCompanyType instead */
	public String getType() {
		return type;
	}
	
	public List<String> getEmailDomains() {
		return emailDomains;
	}

	public String getBlogRssUrl() {
		return blogRssUrl;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public String getDescription() {
		return description;
	}

	public CodeAndName getEmployeeCountRange() {
		return employeeCountRange;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public List<CompanyLocation> getLocations() {
		return locations;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public int getNumFollowers() {
		return numFollowers;
	}

	public List<String> getSpecialties() {
		return specialties;
	}

	public String getSquareLogoUrl() {
		return squareLogoUrl;
	}

	public CodeAndName getStatus() {
		return status;
	}

	public CodeAndName getStockExchange() {
		return stockExchange;
	}

	public String getTicker() {
		return ticker;
	}

	public String getTwitterId() {
		return twitterId;
	}

	public String getUniversalName() {
		return universalName;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public static final class CompanyLocation implements Serializable {
		private static final long serialVersionUID = 1L;

		private final CompanyAddress address;

		private final CompanyContactInfo contactInfo;

		public CompanyLocation(CompanyAddress address,
				CompanyContactInfo contactInfo) {
			this.address = address;
			this.contactInfo = contactInfo;
		}

		public CompanyAddress getAddress() {
			return address;
		}

		public CompanyContactInfo getContactInfo() {
			return contactInfo;
		}
	}

	public static final class CompanyAddress implements Serializable {
		private static final long serialVersionUID = 1L;

		private final String city;

		private final String postalCode;

		private final String street1;

		public CompanyAddress(String city, String postalCode, String street1) {
			this.city = city;
			this.postalCode = postalCode;
			this.street1 = street1;
		}

		public String getCity() {
			return city;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public String getStreet1() {
			return street1;
		}
	}

	public static final class CompanyContactInfo implements Serializable {
		private static final long serialVersionUID = 1L;

		private final String fax;

		private final String phone1;

		public CompanyContactInfo(String fax, String phone1) {
			this.fax = fax;
			this.phone1 = phone1;
		}

		public String getFax() {
			return fax;
		}

		public String getPhone1() {
			return phone1;
		}
	}

	/**
	 * 
	 * @author Werner Keil
	 * @see <a href="http://developer.linkedin.com/documents/company-lookup-api-and-fields">LinkedIn Company Lookup API and Fields</a>
	 */
	public static enum CompanyType implements Labeled, Nameable {
		C("Public Company"), D("Educational"), E("Self Employed"), 
		G("Government Agency"), N("Non Profit"), O("Self Owned"), 
		P("Privately Held"), S("Partnership");

		private final String label;

		CompanyType(String label) {
			this.label = label;
		}

		/**
		 * @return label associated with current value
		 */
		public String getLabel() {
			return label;
		}
		
		/**
		 * @return value of <code>name()</code> for consistency with other functional types
		 */
		public String getName() {
	        return name();
	    }
		
		public static CompanyType ofName(String name) {
			if (name == null) return null; // to avoid NPE
			for (CompanyType ct : values()) {
				if (name.equals(ct.name())) return ct;
			}
			return null;
		}
		
		public static CompanyType ofLabel(String label) {
			if (label == null) return null; // to avoid NPE
			for (CompanyType ct : values()) {
				if (label.equals(ct.getLabel())) return ct;
			}
			return null;
		}

	}
}
