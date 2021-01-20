package week12d02;

import activity.Activity;
import activity.ActivityType;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public int getLastSite() {
        Site lastSite = sites.get(sites.size() - 1);
        int sum = 0;
        for (Site item : sites) {
            if (item.getOdd() == lastSite.getOdd()) {
                sum++;
            }
        }
        return lastSite.getOdd() == 0 ? sum * 2 : sum * 2 - 1;
    }

    public List<Site> getSites() {
        return sites;
    }

    public List<Report> statOf(){
        int[] fenceSum  = new int[Fence.values().length];

        for (Site item : sites) {
            switch (item.getFence()) {
                case PERFECT:
                    fenceSum[0]++;
                    break;
                case NEED_UPGRADE:
                    fenceSum[1]++;
                    break;
                case NO_FENCE:
                    fenceSum[2]++;
            }
        }
        List<Report> result = List.of(
                new Report(Fence.PERFECT,fenceSum[0]),
                new Report(Fence.NEED_UPGRADE, fenceSum[1]),
                new Report(Fence.NO_FENCE, fenceSum[2]));

        return result;
    }
}
