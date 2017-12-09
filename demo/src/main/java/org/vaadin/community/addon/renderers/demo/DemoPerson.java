/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.community.addon.renderers.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class DemoPerson implements Serializable {
    
    private static final long serialVersionUID = 939349319756L;
    
    private final String id;
    private final String firstName;
    private final String surName;
    private final String company;
    private final String companyType;
    private final String city;

    public DemoPerson(String id, String firstName, String surName, String company, String companyType, String city) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.company = company;
        this.companyType = companyType;
        this.city = city;
    }

    
    public static String[] getPropertyOrder() {
        return new String[]{"id", "firstName", "surName", "company", "companyType", "city"};
    }
    
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyType() {
        return companyType;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DemoPerson other = (DemoPerson) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    


    public static List<DemoPerson> getPersonList() {
        List<DemoPerson> personsList = new ArrayList();
        personsList.add(new DemoPerson("P47", "Alan", "Atkinson", "Sed Dui Fusce Incorporated", "Public", "Ajmer"));
        personsList.add(new DemoPerson("P50", "Tyler", "Fleming", "Turpis Aliquam Adipiscing PC", "Private", "Waalwijk"));
        personsList.add(new DemoPerson("P53", "Avram", "Smith", "Cursus Corporation", "Public", "Archennes"));
        personsList.add(new DemoPerson("P56", "Calvin", "Quinn", "Fusce Mollis Corp.", "Private", "Montemesola"));
        personsList.add(new DemoPerson("P59", "Alan", "Doyle", "Ipsum Consulting", "Public", "Gorakhpur"));
        personsList.add(new DemoPerson("P62", "Indigo", "Mcknight", "Auctor Institute", "State owned", "Pemberton"));
        personsList.add(new DemoPerson("P65", "Conan", "Rutledge", "Gravida Mauris Ut Foundation", "Public", "Londerzeel"));
        personsList.add(new DemoPerson("P68", "Germane", "Puckett", "Lacus Vestibulum Lorem Incorporated", "Unknown", "Piotrków Trybunalski"));
        personsList.add(new DemoPerson("P71", "Edan", "Mcgee", "Luctus Vulputate PC", "Private", "Hamilton"));
        personsList.add(new DemoPerson("P74", "Regina", "Cameron", "At Fringilla Purus Limited", "Private", "Buggenhout"));
        personsList.add(new DemoPerson("P77", "Evelyn", "Lynn", "Diam Duis LLP", "Public", "Heppignies"));
        personsList.add(new DemoPerson("P80", "Armand", "Miles", "Massa Mauris Corporation", "Private", "Pune"));
        personsList.add(new DemoPerson("P83", "Briar", "Kline", "Diam Pellentesque Habitant Corporation", "Public", "Monte Vidon Corrado"));
        personsList.add(new DemoPerson("P86", "Valentine", "Elliott", "Mauris Magna Company", "Private", "Nemi"));
        personsList.add(new DemoPerson("P89", "Seth", "Walls", "Tellus Associates", "Public", "Penticton"));
        personsList.add(new DemoPerson("P92", "Curran", "Frye", "Non Ltd", "Private", "Raiganj"));
        personsList.add(new DemoPerson("P95", "Bell", "Wright", "Aenean PC", "Public", "Portofino"));
        personsList.add(new DemoPerson("P98", "Portia", "Bates", "Dolor Fusce Feugiat Associates", "Public", "Victoria"));
        personsList.add(new DemoPerson("P101", "Ferdinand", "Melton", "Ante Maecenas Institute", "Public", "Fahler"));
        personsList.add(new DemoPerson("P104", "Zena", "Leblanc", "Mauris Vestibulum Neque Industries", "Private", "Nancagua"));
        personsList.add(new DemoPerson("P107", "Charlotte", "Lawson", "Semper Pretium Incorporated", "Public", "Illkirch-Graffenstaden"));
        personsList.add(new DemoPerson("P110", "Charles", "Mcmillan", "Sollicitudin Adipiscing Ligula Limited", "Private", "Wepion"));
        personsList.add(new DemoPerson("P113", "Kirestin", "Mccormick", "Molestie Tortor Incorporated", "Public", "Conca Casale"));
        personsList.add(new DemoPerson("P116", "Ulric", "Hahn", "Aenean Industries", "Private", "Erpion"));
        personsList.add(new DemoPerson("P119", "Kimberly", "Lott", "Tempus Non Lacinia Limited", "Public", "Palma de Mallorca"));
        personsList.add(new DemoPerson("P122", "Raphael", "Wilkins", "Mi Duis Risus LLC", "Private", "Duns"));
        personsList.add(new DemoPerson("P125", "Basil", "Stephens", "Auctor Ullamcorper LLC", "Public", "Uberaba"));
        personsList.add(new DemoPerson("P128", "Driscoll", "Tyler", "Non Ante Bibendum Industries", "Private", "Alès"));
        personsList.add(new DemoPerson("P131", "Xenos", "Battle", "Semper Cursus Integer Associates", "Public", "Nanton"));
        personsList.add(new DemoPerson("P134", "Luke", "Thomas", "Duis Gravida Industries", "Private", "Québec City"));
        personsList.add(new DemoPerson("P137", "Noel", "Blake", "Ac Ltd", "Public", "Dufftown"));
        personsList.add(new DemoPerson("P140", "Joan", "Chase", "Urna Vivamus Molestie Company", "Private", "San Donato di Ninea"));
        personsList.add(new DemoPerson("P143", "Rhonda", "Freeman", "Dictum Proin Eget Industries", "Public", "Toulon"));
        personsList.add(new DemoPerson("P146", "Pascale", "Willis", "Morbi Inc.", "Private", "Holyhead"));
        personsList.add(new DemoPerson("P149", "Ralph", "Bryant", "Lacinia At Incorporated", "Public", "Bègles"));
        personsList.add(new DemoPerson("P152", "Meghan", "Strong", "Lacus Cras Interdum Inc.", "Private", "Neudörfl"));
        personsList.add(new DemoPerson("P155", "Norman", "Johnston", "Nec Consulting", "Public", "Elen"));
        personsList.add(new DemoPerson("P158", "Jack", "Rocha", "Ipsum Primis In Foundation", "Private", "San Giuliano di Puglia"));
        personsList.add(new DemoPerson("P161", "Kendall", "Bullock", "At Auctor Ullamcorper Institute", "Public", "Stonewall"));
        personsList.add(new DemoPerson("P164", "Peter", "Shields", "Mi LLP", "Private", "Villata"));
        personsList.add(new DemoPerson("P167", "Arsenio", "Moore", "Tempus Eu Ligula LLP", "Public", "Hall in Tirol"));
        personsList.add(new DemoPerson("P170", "Idona", "Haynes", "Odio Semper Cursus Industries", "Private", "Lincoln"));
        personsList.add(new DemoPerson("P173", "Geoffrey", "Pickett", "Magna Inc.", "Public", "Bally"));
        personsList.add(new DemoPerson("P176", "Leroy", "Powers", "Tempor LLP", "Private", "Denny"));
        personsList.add(new DemoPerson("P179", "Lester", "Savage", "Augue Corp.", "Public", "Delitzsch"));
        personsList.add(new DemoPerson("P182", "Xavier", "Parrish", "Enim Company", "Private", "Acquasparta"));
        personsList.add(new DemoPerson("P185", "Berk", "Livingston", "Phasellus Elit Pede Institute", "Public", "Mandasor"));
        personsList.add(new DemoPerson("P188", "Boris", "Bird", "Parturient Montes Associates", "Private", "Lakeshore"));
        personsList.add(new DemoPerson("P191", "Blake", "Pitts", "Nec Imperdiet Nec Corporation", "Public", "Amroha"));
        personsList.add(new DemoPerson("P194", "Ima", "Serrano", "Suscipit Nonummy Fusce Inc.", "Private", "Savannah"));
        personsList.add(new DemoPerson("P197", "Raphael", "Wilson", "Sapien Imperdiet LLP", "Public", "Kelso"));
        personsList.add(new DemoPerson("P200", "Otto", "Cain", "In Consequat Incorporated", "Private", "Harlow"));
        personsList.add(new DemoPerson("P203", "Luke", "Bentley", "Ac Consulting", "Public", "Leuze"));
        personsList.add(new DemoPerson("P206", "Shana", "Tran", "Sed Pede Cum LLC", "Private", "Contulmo"));
        personsList.add(new DemoPerson("P209", "Bruno", "Rush", "Duis Sit Foundation", "Public", "San Martino in Pensilis"));
        personsList.add(new DemoPerson("P212", "Zachary", "Sweet", "Consequat Lectus Company", "Public", "Curicó"));
        personsList.add(new DemoPerson("P215", "Maxwell", "Sullivan", "Adipiscing Corporation", "Public", "San Mauro Cilento"));
        personsList.add(new DemoPerson("P218", "Tarik", "Sloan", "Rutrum Eu Industries", "Private", "Etalle"));
        personsList.add(new DemoPerson("P221", "Desiree", "Gregory", "Vel Faucibus Id Consulting", "Public", "Meerdonk"));
        personsList.add(new DemoPerson("P224", "Abraham", "Shaffer", "Suspendisse Aliquet Sem PC", "Private", "Vanderhoof"));
        personsList.add(new DemoPerson("P227", "Emerald", "Valenzuela", "Nunc In At PC", "Public", "Kolkata"));
        personsList.add(new DemoPerson("P230", "Asher", "Hancock", "Amet PC", "Private", "Missoula"));
        personsList.add(new DemoPerson("P233", "Aileen", "Stuart", "Nulla Associates", "Public", "Pocatello"));
        personsList.add(new DemoPerson("P236", "Olivia", "Mayo", "Dignissim Pharetra Incorporated", "Private", "Khanewal"));
        personsList.add(new DemoPerson("P239", "Jonas", "William", "Lobortis Quam A Company", "Public", "Cedar Rapids"));
        personsList.add(new DemoPerson("P242", "Celeste", "Sweeney", "Ac Nulla In Associates", "Private", "Flint"));
        personsList.add(new DemoPerson("P245", "Karly", "Crane", "Dis Inc.", "Public", "Futaleufú"));
        personsList.add(new DemoPerson("P248", "Nehru", "Poole", "Nonummy Ac Incorporated", "Private", "Tollembeek"));
        personsList.add(new DemoPerson("P251", "Herman", "Grant", "Tristique Pellentesque Consulting", "Public", "Husum"));
        personsList.add(new DemoPerson("P254", "Carlos", "Benjamin", "Orci Ut Sagittis Corporation", "Private", "Ockelbo"));
        personsList.add(new DemoPerson("P257", "Kelly", "Ochoa", "Scelerisque Neque Sed Industries", "Public", "Flin Flon"));
        personsList.add(new DemoPerson("P260", "Orson", "Cardenas", "Consectetuer Adipiscing PC", "Private", "Kırıkhan"));
        personsList.add(new DemoPerson("P263", "Randall", "Serrano", "Phasellus Nulla Foundation", "Public", "Kalgoorlie-Boulder"));
        personsList.add(new DemoPerson("P266", "Xander", "Hendrix", "Suspendisse Aliquet Ltd", "Private", "Nicolosi"));
        personsList.add(new DemoPerson("P269", "Geraldine", "Jordan", "Erat Vitae Risus Limited", "Public", "Bundaberg"));
        personsList.add(new DemoPerson("P272", "Berk", "Callahan", "Imperdiet Institute", "State owned", "Anzio"));
        personsList.add(new DemoPerson("P275", "Connor", "Romero", "Lectus Associates", "Public", "Temuco"));
        personsList.add(new DemoPerson("P278", "Talon", "Valenzuela", "Eu Tellus Eu Institute", "Private", "Trazegnies"));
        personsList.add(new DemoPerson("P281", "Priscilla", "Finley", "Vitae Erat Vivamus LLC", "Public", "Bath"));
        personsList.add(new DemoPerson("P284", "Ferdinand", "Garcia", "Sociis Industries", "Private", "Owensboro"));
        personsList.add(new DemoPerson("P287", "Glenna", "Humphrey", "Aliquam Associates", "Public", "Daly"));
        personsList.add(new DemoPerson("P290", "Montana", "Cole", "Dictum Inc.", "Private", "Rimouski"));
        personsList.add(new DemoPerson("P293", "Joelle", "Vincent", "Aliquet LLP", "Public", "Breton"));
        personsList.add(new DemoPerson("P296", "Byron", "Melton", "Mollis Integer Tincidunt Limited", "Private", "Anlier"));
        personsList.add(new DemoPerson("P299", "Brielle", "Ross", "Fames Ac Turpis Inc.", "Public", "Long Eaton"));
        personsList.add(new DemoPerson("P302", "Coby", "Carr", "Egestas Company", "Private", "Tire"));
        personsList.add(new DemoPerson("P305", "Alfreda", "Walsh", "Duis Gravida Praesent Associates", "Public", "Zwijndrecht"));
        personsList.add(new DemoPerson("P308", "Samuel", "Hinton", "Ut Quam Vel LLP", "Private", "Farrukhabad-cum-Fatehgarh"));
        personsList.add(new DemoPerson("P311", "Karen", "Petersen", "Suspendisse Industries", "Public", "Paularo"));
        personsList.add(new DemoPerson("P314", "Declan", "Turner", "Pulvinar Company", "Private", "Hamilton"));
        personsList.add(new DemoPerson("P317", "Tamara", "Delacruz", "Ac Tellus Suspendisse Incorporated", "Private", "Ovalle"));
        personsList.add(new DemoPerson("P320", "Jelani", "Atkinson", "Vulputate Corp.", "Private", "Penhold"));
        personsList.add(new DemoPerson("P323", "Chaney", "Valdez", "Vitae Corporation", "Public", "Yaxley"));
        personsList.add(new DemoPerson("P326", "Jameson", "Rosario", "Tempor Limited", "Private", "Crowsnest Pass"));
        personsList.add(new DemoPerson("P329", "Kellie", "Case", "Lorem Institute", "Public", "Burnpur"));
        personsList.add(new DemoPerson("P332", "Leah", "England", "Nisi LLC", "Private", "Tiltil"));
        personsList.add(new DemoPerson("P335", "Kimberly", "Wilkinson", "Dapibus Company", "Private", "Parchim City"));
        personsList.add(new DemoPerson("P338", "Evangeline", "Roberson", "Placerat Corp.", "Private", "Sellano"));
        personsList.add(new DemoPerson("P341", "Kirby", "Houston", "Ut Ipsum Ac PC", "Public", "Palencia"));
        personsList.add(new DemoPerson("P344", "Randall", "Turner", "Eu Tempor Consulting", "Private", "La Roche-sur-Yon"));
        return personsList;
    }

    
}
