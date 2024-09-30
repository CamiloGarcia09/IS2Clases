package co.edu.uco.ucobet.generales.domain.city;

import co.edu.uco.ucobet.generales.domain.Domain;
import co.edu.uco.ucobet.generales.domain.state.StateDomain;

import java.util.UUID;

public class CityDomain extends Domain {

    private String name;
    private StateDomain state;

    protected CityDomain(final UUID id, final String name, final StateDomain state) {
        super(id);
        setName(name);
        setState(state);
    }

    public final String getName() {
        return name;
    }

    public final StateDomain getState() {
        return state;
    }

    public final void setState(final StateDomain state) {
        this.state = state;
    }

    public final void setName(final String name) {
        this.name = name;
    }
}
