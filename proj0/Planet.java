public class Planet {
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;
  public Planet (double xP, double yP, double xV,
                 double yV, double m, String img){
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }
  public Planet(Planet P){
    xxPos = P.xxPos;
    yyPos = P.yyPos;
    xxVel = P.xxVel;
    yyVel = P.yyVel;
    mass = P.mass;
    imgFileName = P.imgFileName;
  }

  public double calcDistance(Planet other){
    double distSquare = (this.xxPos - other.xxPos) * (this.xxPos - other.xxPos) +
                        (this.yyPos - other.yyPos) * (this.yyPos - other.yyPos);
    double dist = Math.sqrt(distSquare);
    return dist;
  }

  public double calcForceExertedBy(Planet other){
    double gra = 6.67e-11;
    double dist = calcDistance(other);
    double r2 = Math.pow(dist,2);
    double force = gra * this.mass * other.mass / r2;
    return force;
  }

  public double calcForceExertedByX(Planet other){
    double dist = calcDistance(other);
    double dx = other.xxPos - this.xxPos;
    double forceX = calcForceExertedBy(other) * dx / dist;
    return forceX;
  }

  public double calcForceExertedByY(Planet other){
    double dist = calcDistance(other);
    double dy = other.yyPos - this.yyPos;
    double forceY = calcForceExertedBy(other) * dy / dist;
    return forceY;
  }

  public double calcNetForceExertedByX(Planet[] allother){
    double netforceX = 0;
    for (int i=0; i<allother.length; i++){
      if (allother[i].mass != this.mass){
        netforceX += calcForceExertedByX(allother[i]);
      }
    }
    return netforceX;
  }

  public double calcNetForceExertedByY(Planet[] allother){
    double netforceY = 0;
    for (int i=0; i<allother.length; i++){
      if (allother[i].mass != this.mass){
        netforceY += calcForceExertedByY(allother[i]);
      }
    }
    return netforceY;
  }

  public void update(double dt, double forceX, double forceY){
    double accX = forceX / this.mass;
    double accY = forceY / this.mass;
    this.xxVel = this.xxVel + accX * dt;
    this.yyVel = this.yyVel + accY * dt;
    this.xxPos = this.xxPos + xxVel * dt;
    this.yyPos = this.yyPos + yyVel * dt;

  }
}
