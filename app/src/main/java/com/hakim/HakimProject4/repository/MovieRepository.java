package com.hakim.HakimProject4.repository;

import com.hakim.HakimProject4.model.CastAndCrew;
import com.hakim.HakimProject4.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static MovieRepository instance;
    private List<Movies> list = new ArrayList<>();

    public static MovieRepository getInstance() {
        if (instance == null) {
            instance = new MovieRepository();
        }

        return instance;
    }

    public List<CastAndCrew> AdAstra() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/kU3B75TyRiCgE270EyZnHjfivoq.jpg", "Bradpit"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/rdKKuq8zWCDYlKSxIfwGo2RUjpN.jpg", "TommyLee Jones"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_bestv2/aL4nmTVtQU2uQDNdBCarTy413CZ.jpg", "Ruth Negga"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_bestv2/o2SOFI53N6Gv5S3fDEBNbeimbzY.jpg", "John Ortiz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_bestv2/jrOj6t9pH8TqO65pnsRuvRNhwqx.jpg", "Liv Tyler"));
        return al;
    }

    public List<CastAndCrew> getThePlatform2019(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9DzlHyJ4aLcoslejWNDx90CWmJu.jpg", "Ivan Massagué"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/A4rhAimrDiTfTVsXNqiJ2clVpx4.jpg", "Antonia San Juan"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/nN75avFiNDJGyKWFLnuk1aJDVph.jpg", "Zorion Eguileor"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/n629l2fu88OO1avUaj8EvwX1BMZ.jpg", "Emilio Buale"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/iwbCGsSwxkBgJFs90F2PCHJsGpP.jpg", "Alexandra Masangkay"));
        return al;
    }

    public List<CastAndCrew> getLawOrder1999(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/dQTXg59BAmEH6iUHQ3XUjg7drtd.jpg", "Mariska Hargitay"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/2XsNifyKI37XBbBbZEH8P21god1.jpg", "Ice-T"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/iVW93qnrTFrBH3Zk2A5T3ReCBBb.jpg", "Richard Belzer"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/oiUzAJu9TV3KxhTeLABVRDq0xoj.jpg", "Christopher Meloni"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/3zcqEyAguRhYofePyJehWm19uUX.jpg", "Kelli Giddish"));
        return al;
    }

    public List<CastAndCrew> getTheFlash2014(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/kEGU1gGySIe63lyL7AnwXEw4rQn.jpg", "Grant Gustin"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/t9YV7TTQXkDWLmoHx8Mu3OUHqsP.jpg", "Candice Patton"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/uDQWtrmSPsNsm2DL3TMMiAtVoTq.jpg", "Carlos Valdes"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/faX0EDc44GL5ZcsEcxTOBcfWpCP.jpg", "Danielle Panabaker"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/iFkViDKW65daGl74VYK3FOvCLfZ.jpg", "Tom Cavanagh"));
        return al;
    }

    public List<CastAndCrew> getSpaceForce2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/dzJtsLspH5Bf8Tvw7OQC47ETNfJ.jpg", "Steve Carrel"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/5coH0AExljEnbseCXKL4CDOVQj8.jpg", "John Malkovich"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/5vV52TSEIhe4ZZLWwv3i7nfv8we.jpg", "Ben Schwartz"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/mCnhiPv7LJOzy5VEnEJewpc339D.jpg", "Diana Silvers"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/pMZ5cB05M6UGtU4I5xI0tpMYXka.jpg", "Tawny Newsome"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/wI0nTOwKDDahBBuW4RjDKiw9jZX.jpg", "Alexey Vorobyov"));
        return al;
    }

    public List<CastAndCrew> getRickMorty2013(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/wYApP38aXe6ZcEtlBAfNRxJTQQi.jpg", "Justin Roiland"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/aGzA5l9S89qLkhpSdjmkerFdZt0.jpg", "Chris Parnell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/ycwiu89cpjqCtSNC5FjbJggjj5R.jpg", "Sarah Chalke"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/4hPvsVP7uDBHDgj7JikIY3Wop18.jpg", "Brandon Johson"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9phhl0oubAKt8D50xLGAb81KPSb.jpg", "Karie Wahlgren"));
        return al;
    }

    public List<CastAndCrew> getThe100(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/igWylWFncQPoJZcmwRsACUYXtyQ.jpg", "Eliza Taylor"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/2cmGyuIhI8pGe1W3mGXK1RtQIeK.jpg", "Bob Morley"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/m5vWJx7LCiJ1ZBoAYJBqKrK4khL.jpg", "Marie Avgeropoulos"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/azTNRQ6VsxWNCwwvbPQu2JRvVCA.jpg", "Lindsey Morgan"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/kYc2nCBBU9pHNDMDopk6WIVXZg6.jpg", "Richard Harmon"));

        return al;
    }

    public List<CastAndCrew> getTheSimpson1989(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/AmeqWhP4A46AWkM4kVphg6jOTQX.jpg", "Dan Castellaneta"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/x3oG3OXtBfTFgqXPqxI1GKVEiaQ.jpg", "Julie Kavner"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/40qNhyYJhSE2Yiy4pnXSZhdufO6.jpg", "Nancy Cartwright"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9AjPwbb3uz4GfgOPBYsy2ILvwkB.jpg", "Yeardley Smith"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9AjPwbb3uz4GfgOPBYsy2ILvwkB.jpg", "Hank Azaria"));

        return al;
    }

    public List<CastAndCrew> getSupernatural2005(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/xNnXTeRG3JyoiYQznwPm8Y3pZfl.jpg", "Jensen Ackles"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/c2ARidmx8gxqIVno0W6LSq77v7U.jpg", "Jared Padalecki"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/c3Cqp1XAdcyeUZKkcrdQsPwb010.jpg", "Jim Beaver"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/s96LOznSIECurv7obBSQihbvK8.jpg", "Ruth Connell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/eK6wzFnDl4XEIXGboyrgaCCNqqV.jpg", "Misha Collins"));
        return al;
    }

    public List<CastAndCrew> getSnowPiercer2020(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/mOVleZFCqMDugAXyyiJBq6LmSah.jpg", "Jennifer Connelly"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/codalhZzB4LvJTSGOnOyrTEsqsF.jpg", "Daveed Diggs"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/gNxtYfg8xXgeQ4YC7Pl3HNRAjol.jpg", "Mickey Sumner"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/lwetyIzRTIOvxdHecVxyZIoRBAT.jpg", "Susan Park"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/9PKwxJfYOgxAkZurTTY17EdIPGY.jpg", "Benjamin Haigh"));
        return al;
    }

    public List<CastAndCrew> getBreakingBad2008(){
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/aGSvZg7uITJveQtGHDcPNI6map1.jpg", "Bryan Cranston"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/u8UdsB9yenM4uHEjmce4nkBn48X.jpg", "Aaron Paul"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/adppyeu1a4REN3khtgmXusrapFi.jpg", "Anna Gunn"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/yV3DZ52LYRf5F605xRas5BEcJrZ.jpg", "Dean Norris"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/zmhhPmXnwjSzVyoTVL93i1EkLRK.jpg", "Betsy Brandt"));
        return al;
    }

    public List<CastAndCrew> getFamilyGuy1999() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/rcxgL68bm4PQkiWDhHJWaGDzKkU.jpg", "Seth MacFarlane"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/evbCnRe5Yfuy0B41PONLTIcvbem.jpg", "Alex Borstein"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/l4No5Eu6j0U80hCIkaSn17AOWrj.jpg", "Seth Green"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/6Lp9qPkMO740Hcp8NBYZZLWWvJF.jpg", "Mila Kunis"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/iYNPvFjsx07iYE1WRp4EIDnxDhH.jpg", "Mike Henry"));
        return al;
    }

    public List<CastAndCrew> getArrow2012() {
        List<CastAndCrew> al = new ArrayList<>();
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/h7KpOs3NlcquoJnZBFMOad81XEZ.jpg", "Stephen Amell"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/bZWO7WfBYI8iojTFozzqN2X3RWL.jpg", "David Ramsey"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/zJpZjePZTI76ncqY2bA6Yzf86FP.jpg", "Katie Cassidy"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/ESdQPJqew87SrBMKtKrN8Z7EJ5.jpg", "Willa Holland"));
        al.add(new CastAndCrew("https://image.tmdb.org/t/p/w138_and_h175_face/3OC1M0rKJO8B3JpwAeavk5EAscl.jpg", "Paul Blackthorne"));
        return al;

    }



    public List<Movies> getData(){
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/8ZX18L5m6rH5viSYpRnTSbb9eXh.jpg","The Platform (2019)","A mysterious place, an indescribable prison, a deep hole. An unknown number of levels. Two inmates living on each level. A descending platform containing food for all of them. An inhuman fight for survival, but also an opportunity for solidarity… ","Drama, Science Fiction, Thriller","2h 32m","Galder Gaztelu-Urrutia","2019", getThePlatform2019()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/6t6r1VGQTTQecN4V0sZeqsmdU9g.jpg","Law & Order: Special Victims Unit (1999)","In the criminal justice system, sexually-based offenses are considered especially heinous. In New York City, the dedicated detectives who investigate these vicious felonies are members of an elite squad known as the Special Victims Unit. These are their stories.","Crime, Drama","43m","Dick Wolf","1999", getLawOrder1999()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg","The Flash (2014)"," After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","Drama, Sci-Fi & Fantasy" ,"44m","Greg Berlanti","2014", getTheFlash2014()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/zgu3p4NvisS8CI68cUfBKbvAvu8.jpg","Space Force (2020)","A four-star general begrudgingly teams up with an eccentric scientist to get the U.S. military's newest agency — Space Force — ready for lift-off.","Comedy","30m","Steve Carrel","2020", getSpaceForce2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/8kOWDBK6XlPUzckuHDo3wwVRFwt.jpg","Rick and Morty (2013)","Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.","Animation, Comedy, Sci-Fi & Fantasy, Action & Adventure","22m","Dan Harmon,Justin Roiland","2013", getRickMorty2013()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg","The 100(2014)","100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.","ci-Fi & Fantasy, Drama, Action & Adventure","43m","Jason Rothenberg","2014", getThe100()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/qcr9bBY6MVeLzriKCmJOv1562uY.jpg","The Simpson","Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.","Animation, Comedy","22m","Matt Groening","1989",getTheSimpson1989()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg","Supernatural (2005)","When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ","Drama, Mystery, Sci-Fi & Fantasy","45m","Eric Kripke","2005",getSupernatural2005()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/n6UNHZoiYj81abwmG38HbNjflDx.jpg","Snowpiercer (2020)","Set more than seven years after the world has become a frozen wasteland, the remnants of humanity inhabit a gigantic, perpetually-moving train that circles the globe as class warfare, social injustice and the politics of survival play out. ","Sci-Fi & Fantasy","50m","Graeme Manson","2020",getSnowPiercer2020()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/ggFHVNu6YYI5L9pCfOacjizRGt.jpg","Breaking Bad (2008)","When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime. ","Drama","45m","Vince Gilligan","2008",getBreakingBad2008()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg","Family Guy (1999)","Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues. ","Animation, Comedy" ,"22m","Seth MacFarlane","1999",getFamilyGuy1999()));
        list.add(new Movies("https://image.tmdb.org/t/p/w220_and_h330_face/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg","Arrow (2012)","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.","Crime, Drama, Mystery, Action & Adventure","42m","Greg Berlanti,Marc Guggenheim,Andrew Kreisberg","2012", getArrow2012()));
        return list;
    }

    public void removeIndex(int index){
        list.remove(index);
    }

    public void clearData(){
        list.clear();
    }
}
