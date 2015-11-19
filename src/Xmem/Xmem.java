/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xmem;

import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author jackh
 */
public class Xmem {

    /*private String id;
    private String name;
    private String postal;
    private Date goodTill;
     */
    public int cid;
    public String type;
    public String fullName;
    public String homeAddress;

    public Date expiryDate;

    public Vector<Member> Xmem;
    
    public Xmem(){
        
    }
    public Xmem(int cid, String type, String fullName, String homeAddress) {
        this.cid = cid;
        this.type = type;
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        getExpiryDate();
    }
    

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getType() {
        return type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public Date getExpiryDate() {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        return expirationDate;
    }

    public void setExpiryDate(Date expiryDate) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 2);

        java.util.Date expirationDate = cal.getTime();

        this.expiryDate = expirationDate;
    }

    public boolean validateVIPF(int cid) {
        
            int sum = 0;
            String clients[] = Integer.toString(cid).split("");

            if (clients.length <= 9) {
                for (int i = 0; i < clients.length; i++) {
                    int num = Integer.parseInt(clients[i]);
                    while (num > 0) {
                        //The VIP_Family number is started with 3 fix digits “303”. 
                        sum += num % 10;
                        num /= 10;
                    }
                }
                if (sum % 6 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        
    }

    public boolean validateVIP(int cid) {
        int sum = 0;
        String clients[] = Integer.toString(cid).split("");

        if (clients.length <= 9) {
            for (int i = 0; i < clients.length; i++) {
                int num = Integer.parseInt(clients[i]);
                while (num > 0) {
                    //The VIP_Family number is started with 3 fix digits “303”. 
                    sum += num % 10;
                    num /= 10;
                }
            }
            if (sum % 6 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean validateCompanyMember(String id) {
        int sum = 0;
        String numbers[] = id.split("");
        if (numbers.length <= 8) {
            for (int i = 0; i < numbers.length; i++) {
                int num = Integer.parseInt(numbers[i]);
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
            }
            if (sum % 8 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
     public boolean validatePrimaryMember(String id) {
        int sum = 0;
        String numbers[] = id.split("");
        if (numbers.length <= 8) {
            for (int i = 0; i < numbers.length; i++) {
                int num = Integer.parseInt(numbers[i]);
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
            }
            if (sum % 3 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return ""+expiryDate+" "+ cid + " " + type + " " + fullName + " " + homeAddress  ;
    }
    
    
}
